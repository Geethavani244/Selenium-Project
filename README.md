


Bookswagon Automation Project:

This project automates key functionalities of the [Bookswagon](https://www.bookswagon.com/) website using the Page Object Model (POM) design pattern and TestNG framework. The project includes functionalities like navigating through different modules, searching for books, adding them to the cart, and verifying the cart and checkout processes.



Table of Contents:
1. [Overview](#overview)
2. [Features](#features)
3. [Technologies Used](#technologies-used)
4. [Project Structure](#project-structure)
5. [Setup and Execution](#setup-and-execution)
6. [Test Scenarios](#test-scenarios)
7. [Extent Reports](#extent-reports)
8. [Contribution](#contribution)
9. [License](#license)

---
Overview:
The project demonstrates automation of Bookswagon's:
- New Arrivals
- Best Sellers
- Featured Authors
- Request a Book modules
- Search functionality for books
- Cart validation and checkout process

The framework follows best practices to ensure modularity, maintainability, and scalability.

---

Features:
- Automates the following modules:
  - New Arrivals: Adds a book to the cart and proceeds to checkout.
  - Best Sellers: Similar to New Arrivals.
  - Featured Authors: Navigates, selects a book, and proceeds to checkout.
  - Request a Book: Interacts with the form to request unavailable books.
  - Search Module: Searches for a book (e.g., "Alchemist"), adds it to the cart, validates the cart, and checks out.
- Page Object Model for defining page elements and actions.
- Extent Reports** for detailed test reports.
- Screenshot capture on test failures.
- Configurable properties using a `config.properties` file.
- Supports execution via Maven.

---

Technologies Used:
Java (Programming Language)
  Selenium WebDriver (Browser Automation)
  TestNG (Test Framework)
  Maven (Build Tool)
  Extent Reports (Reporting Tool)
  Git/GitHub (Version Control)

---

Project Structure
BookswagonAutomation/
│
├── src/main/java/
│   ├── pages/                   # Page Object classes
│   ├── utils/                   # Utilities like Waits, Screenshots, ConfigReader
│   └── config/                  # Property file handling
│
├── src/test/java/
│   ├── tests/                   # TestNG test classes
│   └── listeners/               # Listeners for reports and screenshots
│
├── test-output/                 # TestNG default reports
├── extent-reports/              # Custom HTML Extent reports
├── pom.xml                      # Maven configuration
└── README.md                    # Project documentation



Setup and Execution

 Prerequisites
- Install Java 11 or higher.
- Install Maven.
- Install a compatible web browser(e.g., Chrome).
- Download the corresponding **WebDriver** for the browser.

Steps to Setup
1. Clone the repository:
   bash
   git clone https://github.com/<your-username>/bookswagon-automation.git
   cd bookswagon-automation
   
2. Configure the `config.properties` file located in `src/main/resources`:
   properties
   URL=https://www.bookswagon.com/
   browser=chrome
   implicitWait=10
   explicitWait=15
   screenshotPath=./screenshots/
   reportPath=./extent-reports/
   

Run Tests
Compile the project:
  bash
  mvn clean compile

Execute tests:
  bash
  mvn test
View Reports:
  After execution, open the Extent Report located in `extent-reports/`.

Test Scenario
Automated Modules
1. New Arrivals: Navigate, select a book, add to cart, and buy.
2. Best Sellers: Similar to New Arrivals.
3. Featured Authors: Navigate to a featured author, add a book to the cart, and buy.
4. Request a Book: Fill the request form for a book.
5. Search Module:
   - Search for "Alchemist".
   - Add it to the cart.
   - Assert the cart details.
   - Proceed to checkout.

---

 Extent Reports
After test execution, an HTML report will be generated under `extent-reports/`. It includes:
- Test execution summary.
- Pass/Fail status.
- Screenshots for failed tests.

Contribution
Contributions are welcome! Please follow these steps:
1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature-branch-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Description of changes"
   ```
4. Push to your branch:
   ```bash
   git push origin feature-branch-name
   ```
5. Open a pull request.

---

 License
This project is licensed under the MIT License. See the `LICENSE` file for details.

---

Let me know if you'd like any additional sections or adjustments!
