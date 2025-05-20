<h1 align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=30&duration=3000&pause=1000&color=F7941D&center=true&vCenter=true&width=600&lines=🚀+Magento+Project;🧪+Manual+%26+Automation+Testing;+📚Agile+Software+Testing;" alt="Typing SVG" />
</h1>

# 👩‍💻 Magento Website Testing Project

![Badge](https://img.shields.io/badge/Project-Testing-blue) ![Badge](https://img.shields.io/badge/Sprint-1%20Week-green) ![Badge](https://img.shields.io/badge/Status-Completed-brightgreen)  

# 🛒 CucumberProjectMagento

 An e-commerce test automation project based on **Magento Open Source**  
 Developed using Cucumber + Selenium + Java technologies.

---

## 📌 Project Purpose

The goal is to **automatically test** the following core functions on the Magento platform:

- Creating a new user registration
- Login and authorization
- Adding and editing addresses
- Product search and filtering (by SKU)
- Adding/removing products to/from the cart
- Creating and completing orders
- Managing favorite (wishlist) lists
- Menu (navigation) verification

🎯 Aim: To reduce regression testing load with test automation and continuously verify the system’s correctness.

🔗 [Magento Demo Website](https://magento.softwaretestingboard.com/)

---

## 🛠️ Technologies and Tools Used

| Technology           | Description                                   |
|---------------------|-----------------------------------------------|
| ![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=java&logoColor=white) | Backend programming language       |
| ![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=flat&logo=selenium&logoColor=white) | Web UI automation tool             |
| ![TestNG](https://img.shields.io/badge/TestNG-lightgrey?style=flat) | Test framework                    |
| ![Cucumber](https://img.shields.io/badge/Cucumber-23D96C?style=flat&logo=cucumber&logoColor=white) | BDD (Behavior Driven Development) Framework |
| ![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat&logo=apachemaven&logoColor=white) | Project management and dependencies |
| Apache POI         | Reading/writing Excel data                    |
| Extent Reports     | Rich HTML test reporting                       |
| Git & GitHub       | Version control                               |
| Page Object Model  | Automation architecture                        |
| Jira / Zephyr      | Test management (STLC - Bug tracking)          |
| SLF4J              | Logging interface                             |

---

## 👥 Team Members

| Member | Role |
|-----------|----------------|
| 🧑‍💻 [Erdem Özkan](https://github.com/ErdemOzkann) | QA |
| 👩‍💻 [Diyar Ölmez](https://github.com/diyarolmezz) | QA |
| 👨‍💻 [Barış Saydam](https://github.com/BarisSaydam) | QA |
| 👨‍💻 [Ömer Boncuk](https://github.com/OmerBoncuk) | QA |
| 👨‍💻 [Atilla Toros Avcı](https://github.com/AtillaTorosAvci) | QA |
| 👩‍💻 [Gamze Batmaz](https://github.com/GAMZE3845) | QA |

> Team coordination was conducted via RocketChat.  
> Work was divided into Cucumber scenarios based on individual responsibilities.

---

## 🧪 User Stories

| US ID  | Story Title              | Description                              |
|--------|-------------------------|------------------------------------------|
| US701  | 👤 User Registration     | Creating a new user registration         |
| US702  | 🔐 Login                 | Login process                            |
| US703  | 📍 Address Management    | Adding, deleting, editing addresses     |
| US704  | 🧭 TAB Menu Verification | Main category - subcategory access      |
| US705  | 🛒 Add to Cart           | Cart management                         |
| US706  | 💳 Order Creation        | Order and payment processing            |
| US707  | 🔍 Product Search (SKU)  | Product search                          |
| US708  | ❤️ Wishlist Management   | Managing favorite lists                  |

➡ Details are available in the `UserStoriesTR_Magento.pdf` file.

---

## ✨ Skills Highlighted

- Manual Testing 🔍
- Automated Testing 🧪
- Functional UI Testing 🖥️
- BDD Implementation 🥒
- CI/CD Integration 📦
- Bug Reporting 🐞  
- Agile Sprint Workflow 📈  
- Git & GitHub Collaboration 🔧  
- Negative Testing Scenarios ⚡  
- Test Documentation ✍️

---

## 🚀 Setup and Run

```bash
# 1. Clone the project
git clone https://github.com/ErdemOzkann/CucumberProjectMagento.git

# 2. Navigate to project directory
cd CucumberProjectMagento

# 3. Load Maven dependencies
mvn clean install

# 4. Run tests
mvn test
