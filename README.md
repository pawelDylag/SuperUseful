# SuperUseful
**Example project for multi-module library architecture that tries to follow SOLID principles.**

The idea is to have small modules responsible for a strict thing that you can reuse across your stack. 
If a bug emerges — it will only need to be fixed in that one place. 
Your codebase will be super-easy to rearrange and you will stand victorious against the vicissitudes of your project requirements.

Feel free to fork it and use it in anyway you want!

![Architecture scheme](/images/architecture.png)

As you can see, the main layer is an `interfaces-api` module, which is being maintained as a separate library.
It only contains interfaces of all objects used across the stack. 
The concrete implementation lies in separate modules that implement the interfaces — like `cloud-module`,
or `core-module` for example. In such way, every module needs only to declare a dependency on `interfaces-api`. 
This will enable them to access other parts of your stack via those interfaces, 
thus making them independent from concrete implementation.

## Third party libraries
I used here `RxJava` because the combo `RX+Kotlin` is so powerful :)

