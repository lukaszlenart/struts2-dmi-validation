# Struts2 DMI aware validation

[![Build Status](https://travis-ci.org/lukaszlenart/struts2-dmi-validation.png?branch=master)](https://travis-ci.org/lukaszlenart/struts2-dmi-validation)

Simple demo how to define your own naming schema for XML validation files. 
If DMI is enabled and method name is set the file name will be like this: 

&lt;ActionClass&gt;-&lt;actionAlias&gt;_&lt;methodName&gt;-validation.xml

The whole magic happens in `DMIAwareValidationInterceptor.java` which simple
overrides `getValidationContext(ActionProxy proxy)` to provide their own
naming convention.

Published under [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)
