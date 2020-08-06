package com.example.testingapp

import com.example.testingapp.activitiesTestInIsolation.MainActivityTest
import com.example.testingapp.activitiesTestInIsolation.SecondaryActivityTest
import org.junit.runner.RunWith
import org.junit.runners.Suite

//SuiteClasses : are used to run punch of test classes
@RunWith(Suite::class)
@Suite.SuiteClasses(
    MainActivityTest::class,
    SecondaryActivityTest::class
)
class ActivitiesTestSuites