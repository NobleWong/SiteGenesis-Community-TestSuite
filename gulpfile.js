var gulp  = require('gulp')
var xlt = require('node-xlt');

var xltOptions = {pathToXLT: '../PATH_TO_XLT'};
xlt.setOptions(xltOptions);

function setParams(webdriver, width, height) {
    if (!webdriver || webdriver.length == 0 || webdriver == "undefined") { 
        xltOptions.xltWebDriver = null;
    } else {
        xltOptions.xltWebDriver = webdriver;
    }
    if (!width || width.length == 0 || width == "undefined") { 
        xltOptions.xltWidth = null;
    } else {
        xltOptions.xltWidth = parseInt(width);
    }
    if (!height || height.length == 0 || height == "undefined") { 
        xltOptions.xltHeight = null;
    } else {
        xltOptions.xltHeight = parseInt(height);
    }
    xlt.setOptions(xltOptions);
};

gulp.task('javaversion', function() {
    xlt.javaVersion(function(err, res){});
});

gulp.task('checkPrerequisites', function() {
    xlt.checkPrerequisites()
});

gulp.task('compile', function() {
    xlt.deleteTestCaseDirectory();
    xlt.compileAllTestCases();
});

gulp.task('run', ['javaversion', 'checkPrerequisites', 'compile']);

gulp.task('allSequential',['run'], function() {
    setParams(process.env.webdriver, process.env.width, process.env.height);
    xlt.runAllTestCases( );
});

gulp.task('allParallel',['run'], function() {
    setParams(process.env.webdriver, process.env.width, process.env.height);
    xlt.runAllTestCasesParallel(null, function(res){});
});

gulp.task('single',['run'], function (){
    var name = process.env.name;
    if (!name || name.length == 0) {
        console.log('You need to provide the name of a test script.'); 
    } else {
        setParams(process.env.webdriver, process.env.width, process.env.height);
        xlt.runSingleTestCase(name);
    }
});

gulp.task('default', ['allSequential']);