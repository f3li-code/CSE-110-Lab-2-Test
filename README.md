# CSE 110 Fall 23 Lab 2

## Question 1
What is, do you think, one big benefit of continuous integration to a software team?
- So that we ensure working product every time after every iteration to demo to customer
## Question 2
In your own words, what is the difference between a unit test and an integration test? Which kind(s) of tests could serve as regression tests?
- A unit test tests one functionality, an integration test tests how multiple functionalities work together
- A regression test tests if a new functionality breaks previous working code. So both unit tests and integration tests can work as regression tests.
## Question 3
In your own words, what is a regression test and why is it important?
- A regression test tests if the updates break the previous working code
## Question 4
What does it mean if you are struggling to write unit tests?
- That the programmer is not structuring the code well
## Question 5
Why is it important to fake dependencies in unit tests?
- so that we can eliminate other possible sources for errors and only test the unit we want to test.
## Question 6
Why is it important to write UI tests? What role do they serve that unit/integration tests alone do not cover?
- So that the developers can test in the actual users' perspective. UI tests focuses on testing the users' experience, not whether the code works as desired
## Question 7
How do you set up continuous integration using Github Actions (What kind of file do you need to use and where should you store it?)
- In Settings -> Actions -> General, Allow all actions and reusable workflows .github/workflows/run-unit-tests.yaml