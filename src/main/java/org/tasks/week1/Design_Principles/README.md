## Software Design Principles

> No one like bad design, be like 👇👇 after adding new features

<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTDQAI-Z7iHpyXfP5EPiRMM8qapVMFuxKQqHA&usqp=CAU" alt="reversed gun when you click fire you shoot yourself">

-  **So to avoid that we will know some `general guides` and `problems that case bad design`**
---
### dependencies
> First we need to understand design dependencies.

1. **Association**
    - Association represents a relationship between two or more objects where all objects have their own  life cycle and **there is no owner**.
    - Association is based on **HAS-A** Relationship.
      <br>
      <img src="http://dotnetlearners.com/images/blogs/3DE7C5F5-E2CC-DE39-0FB5-A7FC76BD723B.png">
2. **Aggregation**
    - Aggregation is a special form of Association where all objects have their own life cycle **but there is ownership**.
    - This represents whole-part or a-part-of relationship. Aggregation is based on **HAS-A** Relationship.
    <br>
    <img src="http://dotnetlearners.com/images/blogs/F90617BD-8A5E-CAE7-BD36-7E8923BA082D.png">
3. **Composition**
    - Composition is a special form of Aggregation. In this relationship **child objects does not have their life cycle without Parent object**.
    - If a parent object is deleted, all its child objects will also be deleted.
    - Composition is based on **PART-OF - death** relationship.
      <br>
    <img src="http://dotnetlearners.com/images/blogs/FF8139A6-0B04-EAFA-9FE8-FF509CBADC8B.png">
4. **Inheritance**
    - One class can use features from another class to extend its functionality.
    - Inheritance based on IS-A Relationship.
   <br>
   <img src="http://dotnetlearners.com/images/blogs/49600117-9D3B-C6B8-FF23-C66E6A6D2901.png">


---

---

### How to discover bad design ?!
> now after we know dependencies we need to take care from bad design reasons.
- #### **Symptoms of Rotting Design** 
    - At first, it isn't so bad but over time as the rotting continues because of (adding,updating and editing feature )
    - Then the program becomes a festering mass of code that the developers find increasingly hard to maintain.
- #### **Martin has identified 4 major symptoms that help identify "rotting" code.**
    >  They are: rigidity, fragility, immobility, and viscosity
  
  <img alt="image to show Rigid and Fragile" src="https://miro.medium.com/v2/resize:fit:640/0*sjSdTZYXCpcS7gjT">
    
    - **RIGIDITY** (The design is hard to change)
        - Rigidity is the tendency for software to be difficult to change, even in simple ways.
        - Every change causes a cascade of subsequent changes in dependent modules.
        - And as you see above 👆👆, We must make many changes to integrate the new feature
    - **Fragility** (The design is easy to break)
        - Closely related to rigidity is fragility.
        - Fragility is the tendency of the software to break in many places every time it is changed.
        - And these areas that has been broken has no relation with area that has been changed 👆!!.
        - And as you see above 👆👆, The tragedy of the rigid and fragile system.
        - We must make many changes to integrate the new feature (rigidity), and those changes have a tendency to produce bugs within the wider system (fragility).
    - **Immobility** (The design is hard to reuse)
        - <p> <img src="https://images.pexels.com/photos/3110502/pexels-photo-3110502.jpeg?auto=compress&cs=tinysrgb&h=150"> </p>
        - it's hard to extract features from code to reuse as image above👆.
        - This is the inability to reuse code in other parts of your project because the code in question has too much baggage.
        - Even if the software you wish to copy is very similar to the new software you need, the time it would take to clean up the code outweighs the time it would take to build it from the ground up. 
    - **Viscosity** (It is hard to do the right thing)
        - <p><img src="https://images.pexels.com/photos/302163/pexels-photo-302163.jpeg?auto=compress&cs=tinysrgb&h=150"></p>
        - Viscosity can come in two forms:
          1. viscosity of the design.
              - When the design preserving methods are harder to employ than the hacks (hacks means: make unstructured solutions),
              - then the viscosity of the design is high.
          2. viscosity of the environment.
              - when the development environment is slow and inefficient.
              - For instance, if the process of checking in a few files takes hours.

---
> While it is obviously the goal of any good software engineer to write clean clear code, ever-changing project goals and requirements can often be pointed to as the cause of the above code smells. But, it is important to note that the theme running through many of these code smells is the use of improper dependencies. To help manage dependencies, Martin has identified SOLID design patterns, outlined below.
---
### SOLID Design Principles
[solid-principles-java](https://www.javatpoint.com/solid-principles-java)
<p >  
<img  height="250" src="https://miro.medium.com/v2/resize:fit:640/format:webp/0*gQ8muacVr2mtSVRC.jpg">
</p>
<br>

1. **Single Responsibility Principle (SRP):**
    - The class should only have one and only one reason to be changed.
    - When there is more than one responsibility, there is more than one reason to change that class at the same point.
    - So, there should not be more than one separate functionality in that same class that may be affected.
    - see example here [solid-principles-java](https://www.javatpoint.com/solid-principles-java)
   <br>
   <img height="250" src="https://miro.medium.com/v2/resize:fit:640/format:webp/0*htszcnzRhyab2gzf.jpg" >
   <br>
2. **Open Closed Principle (OCP):**
    -  the module should be open for extension but closed for modification.
    - The extension allows us to implement new functionality to the module.
    - All of these techniques are based upon abstraction.
    - see example here [solid-principles-java](https://www.javatpoint.com/solid-principles-java)
   <p float="left">
   <img height="250" src="https://miro.medium.com/v2/resize:fit:640/0*rsoTEKv6TomtMsvs">
   <img height="250" src="https://media.licdn.com/dms/image/C4E12AQHM6kmx7419nA/article-inline_image-shrink_1000_1488/0/1622360461995?e=1695254400&v=beta&t=ojyEneAX3scMWwNQTdk_1rJVCaoUHqr4qIRcQZotHnU">
   </p>
3. **Liskov's Substitution Principle (LSP):**
    - The Liskov Substitution Principle (LSP) was introduced by Barbara Liskov.
    - It applies to inheritance in such a way that the derived classes must be completely substitutable for their base classes.
    - In other words, if class A is a subtype of class B, then we should be able to replace B with A without interrupting the behavior of the program.
    - All what you need is (subclasses should add to a base class’s behavior, not replace it (don't spoil super class behavior))
    - see example here [solid-principles-java](https://www.javatpoint.com/solid-principles-java)
   <p float="left">
   <img height="250" src="https://miro.medium.com/v2/resize:fit:720/format:webp/0*b-62MfL8zvj2O6so.jpg">
   <img height="250" src="https://media.licdn.com/dms/image/C4E12AQGOD8OKOt4N7A/article-inline_image-shrink_1000_1488/0/1622360628466?e=1695254400&v=beta&t=OuOyybwDTPCz3TsygMVL07pSsWYPjio3n8EXT4WsY4k">
   </p>
4. **Interface Segregation Principle	(ISP):**
    - Many client-specific interfaces are better than one general-purpose interface.
    - It is better to break down main classes into smaller more specific classes rather than try to maintain one large generalized class.
    - This way, the class’ clients aren’t relying on methods that they don’t use.
    - If there is a service that is accessed by different types of clients each requiring to call different methods then rather than loading the service with all the methods the clients need, we can have specific interfaces for each client which our service can implement.
    - This reduces rigidity and allows for better maintainability, like examples blow.
    - see example here [solid-principles-java](https://www.javatpoint.com/solid-principles-java)
   <p float="left">
      <img height="250" src="https://miro.medium.com/v2/resize:fit:640/0*fQTMtuVlQghaAmWL">
      <img height="250" src="https://media.licdn.com/dms/image/C4E12AQF18IyNA6Ei_A/article-inline_image-shrink_1500_2232/0/1622360738734?e=1695254400&v=beta&t=2M1t_swv-NjIN0Crva5Fs4gRD8p7-4x1cX2wHdRa79c">
   </p>
5. **Dependency Inversion Principle (DIP):**
    - High-level modules should not depend on the low-level module but both should depend on the abstraction.
    - Because the abstraction does not depend on detail but the detail depends on abstraction.
    - Dependency Inversion is the strategy of depending upon interfaces or abstract functions and classes, rather than upon concrete functions and classes.
    - see example here [solid-principles-java](https://www.javatpoint.com/solid-principles-java)
   <p float="left">
   <img  height="250" src="https://miro.medium.com/v2/resize:fit:640/format:webp/0*cBS6KK7Nd502tAZf.jpg">
   <img  height="250" src="https://media.licdn.com/dms/image/C4E12AQEGt9-1QAkqQQ/article-inline_image-shrink_1500_2232/0/1622360804670?e=1695254400&v=beta&t=f2HDiTpnNkg8J7Lzj9lnEMG0gUDYF1XohpTTaqjCObY">
   </p>

---
### Other Design Principles
1. **Do not Repeat Yourself (DRY):**
    - this principle states that “Every piece of knowledge(code) must have a single, unambiguous, authoritative representation within a system”
    - When the DRY principle is applied successfully, a modification of any single element of a system does not require a change in other logically unrelated elements.
    - We can use Abstractions for example to keep common code at one place.
2. **keep it simple, stupid (KISS):**
    -  The KISS principle states that most systems work best if they are kept simple rather than made complicated.
    -  therefore, simplicity should be a key goal in design, and unnecessary complexity should be avoided.
3. **You Arn’t Gonna Need It (YAGNI):**
    - Never just foresee that we might need them.
     - This principle states that always implement things when you actually need them never implements things before you need them
4. **Law of Demeter (LoD):**
    - Principle of Least Knowledge (object should not know how other object work exactly (just use the functionality))
    - It is typically summarized as “Only talk to your immediate friends.
5. **Encapsulate what varies:**
6. **Favor Composition over Inheritance:**


---

### Resources
* [software-engineering-software-design-principles](https://www.javatpoint.com/software-engineering-software-design-principles)
* [association-vs-composition-vs-aggregation](https://javarevisited.blogspot.com/2014/02/ifference-between-association-vs-composition-vs-aggregation.html)
* [inheritance-association-aggregation-composition](http://dotnetlearners.com/blogs/inheritance-association-aggregation-composition)
* [software-engineering-coupling-and-cohesion](https://www.javatpoint.com/software-engineering-coupling-and-cohesion)
* [what-is-software-rigidity](https://olaf-thielke.medium.com/what-is-software-rigidity-e8b6ea53bc74)
* [software-design-principles-aneshka-goyal](https://www.linkedin.com/pulse/software-design-principles-aneshka-goyal/)
* [principles_inclass](http://www.cs.mun.ca/~av/courses/5895-current/manual_uploads/principles_inclass.pdf)
* [solid-design-principles](https://medium.com/@trionamoynihan/solid-design-principles-eec367b2b8#:~:text=Martin%20has%20identified%204%20major,fragility%2C%20immobility%2C%20and%20viscosity)
* [coupling-cohesion](https://feature-sliced.design/docs/reference/isolation/coupling-cohesion)
---

### Contact
Ahmed Sakr | [@Ahmed-Mohmed-Sakr](https://github.com/Ahmed-Mohmed-Sakr)
