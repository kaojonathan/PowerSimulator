# PSSHT Calculator

Power and Sample Size for Hypothesis Testing Calculator. 

Dual use calculator:

	1. Given the parameters for a hypothesis test and a sample size, the calculator returns the values 
	for type I error, type II error and statistical power.

	2. Given the parameters for a hypothesis test and a desired statistical power, the calculator returns 
	the values for type I error, type II error, and required sample size.

Calculates for the following Hypothesis Tests:

 1. One Sample Z-Test for Proportions
 2. Two Sample Z-Test for Proportions
 3. One Sample T-Test for Means
 4. Two Sample T-Test for Means

## Context

Developed for school statistics project.  Statistical power is defined as the probability that a hypothesis test rejects the null hypothesis when the null hypothesis is in fact false.  In real world applications, researchers need to know the power of hypothesis tests to know how effective a hypothesis test is. Given the constraints of time and budget, calculating the minimum sample size required for a desired power level is a crtical skill for practical research.

## Examples

Home Screen

![image](https://user-images.githubusercontent.com/83883817/126055090-84fb6adb-f4d0-44c1-9ee0-24537d0cd4af.png)

Power of One Sample Z-Test 

![image](https://user-images.githubusercontent.com/83883817/126055130-cf426fc7-4a8b-4616-9542-b75911bd5810.png)

Sample Size Required for a Power of 0.8 for a One Sample T-Test

![image](https://user-images.githubusercontent.com/83883817/126055151-22b47ac0-cd35-40f9-89ab-ff15dd532d9a.png)


## Acknowledgement

This project uses Commons Math from the Apache Commons Mathematics Library for Normal Distributions in Java.
