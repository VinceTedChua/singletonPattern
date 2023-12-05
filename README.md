# Centralized Queuing System For Pag-ibig Office with Singleton Pattern 

The Pag-ibig office implements a centralized queuing system for three help desk stations. Individuals visiting the office obtain a queue number from this centralized system. Additionally, there's an online monitoring system that displays the current queued number in real-time for individuals monitoring the queue remotely.

Each help desk station has an option to reset the queuing number based on an inputted number, allowing flexibility in managing the queue during specific situations, such as reorganization or technical issues. This queuing system ensures a single centralized queue number for all help desk stations, while the reset option offers control and adjustment in exceptional circumstances.

This approach aims to maintain an organized queuing process for individuals visiting the office and provides the flexibility to handle queue adjustments as needed.


# Definition(s)
Singleton is a creational pattern restricting instatiation of another class to promote cohesivity and organization. Allowing only global entry of the point of access within an interface.



# UML Diagram




# Sample Java Code Solution
![CHUA_SINGLETON_SAMPLE_OUTPUT](https://github.com/VinceTedChua/singletonPattern/assets/142372312/0b78d4f6-4d72-4c3c-b49a-deec422730a1)

This sample code exemplifies the central idea of individuals obtaining number system and being monitored. As it is monitored we know for a fact ithas some reorganization numbers due to priority or users logging in and may drastically affect the user numbering system...

# Kindly check the src/singletonPattern for the detailed Code Solution(s)
