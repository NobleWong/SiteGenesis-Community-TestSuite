var grunt = require('grunt');
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

grunt.initConfig({
});

grunt.registerTask('javaversion', function() {
    var done = this.async();
    xlt.javaVersion(function(err, res){
        console.log("Vers= "+ res);
        done(true);
    });
});

grunt.registerTask('checkPrerequisites', function() {
    xlt.checkPrerequisites();
});

grunt.registerTask('compile', function() {
    xlt.deleteTestCaseDirectory();
    xlt.compileAllTestCases();
});

grunt.registerTask('run', ['javaversion', 'checkPrerequisites', 'compile']);

grunt.registerTask('runAllSequential', function(webdriver, width, height) {
    setParams(webdriver, width, height);
    xlt.runAllTestCases( );
});

grunt.registerTask('allSequential', function(webdriver, width, height) {
    grunt.task.run(['run', 'runAllSequential:'+webdriver+':'+width+':'+height]);
});

grunt.registerTask('runAllParallel', function(webdriver, width, height) {
    var done = this.async();
    setParams(webdriver, width, height);
    xlt.runAllTestCasesParallel(null, function(res){
        done(true);
    });
});

grunt.registerTask('allParallel', function(webdriver, width, height) {
    grunt.task.run(['run', 'runAllParallel:'+webdriver+':'+width+':'+height]);
});

grunt.registerTask('runsingle', function(name, webdriver, width, height){
    if (!name || name.length == 0 || name == "undefined") { 
        grunt.warn('You need to provide the name of a test script.'); 
    } else { 
        setParams(webdriver, width, height);
        xlt.runSingleTestCase(name);
    }
});

grunt.registerTask('single', function(name, webdriver, width, height) {
    grunt.task.run(['run', 'runsingle:'+name+':'+webdriver+':'+width+':'+height]);
});

grunt.registerTask('default', ['allSequential']);