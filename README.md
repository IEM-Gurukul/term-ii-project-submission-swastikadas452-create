[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title
NivoraStay– Intelligent Hotel Reservation System

---

## Problem Statement (max 150 words)
Many small and medium hotels still rely on manual booking systems or simple spreadsheets to manage reservations. These methods often lead to issues such as double bookings, difficulty tracking room availability, and inefficient customer record management. As a result, hotel staff may struggle to confirm reservations quickly and maintain accurate data.

The NivoraStay-Intelligent Hotel Reservation System aims to solve these problems by providing a structured digital solution using object-oriented design. It models rooms, bookings, and customers as separate objects and uses a centralized BookingManager to handle reservation processing and availability validation, improving efficiency and reducing errors.

---

## Target User
Hotel administrators, Reception staff, and Hotel managers, and Customer.


---

## Core Features
- Room availability tracking
- Booking and reservation management
- Booking modification and cancellation
- Customer record management
- Prevention of double booking
- Booking validation to prevent invalid reservations


---

## OOP Concepts Used
- Abstraction
- Inheritance (e.g., different types of rooms like DeluxeRoom extending Room)
- Polymorphism (e.g., different booking confirmation methods)
- Encapsulation
- Exception Handling
- Singleton Design Pattern (BookingManager)
- Collections (ArrayList for rooms, HashMap for customers)



---

## Proposed Architecture Description

The system follows a layered object-oriented architecture to ensure clear separation of responsibilities. The core entities of the system include Room, Booking, and Customer classes, which represent real-world hotel components.

A central BookingManager class acts as the controller that manages all booking operations, including room availability checking, reservation processing, and validation to prevent double bookings. It ensures that all interactions between users and the system are handled efficiently.

The system uses collections such as ArrayList to store room data and HashMap to manage customer records for fast access and retrieval. Exception handling is used to manage invalid booking requests.

Users (customers or administrators) interact with the system through a console-based interface, where inputs are processed and results are displayed accordingly. This architecture makes the system modular, scalable, and easy to maintain.

---

## How to Run


---

## Git Discipline Notes
Minimum 10 meaningful commits required.
