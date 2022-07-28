
#  Word frequency counter

This program takes the input as from the "word" key defined in config file, and then counts the number of times it had appeared in the file.
If the word is not present in the file then it'll print all the words with  their count.

Or in simple words
This program is used to find the occurrence of the given word and if not specified then of all words from the given document.


## Features

- Keeps log record 
- Kepps track of frequency
- platform indepedent
- Thread safe
- stack trace is printed in case of exception or error.
- if the given word is not in the file - All word frequencies are as output.


## Contribution Guidelines
The contribution guidelines are as per the guide HERE.


### Instructions
- Fork this repository
- Clone your forked repository
- Add your scripts
- Commit and push
- Create a pull request
- Star this repository
- Wait for pull request to merge
- Celebrate your first step into the open source world and contribute more

 ***Note: Please do not have the project link reference your local forked repository. Always link it to this repository after it has been merged with main.***
## Running Tests

To run tests, run the following command


Create a txt file and add content as:
```bash
gemi mini gini gemi mine gini
gemi mini gini gemi mine gini
```

**Input** :
```bash
```
**Output** : 
```bash
{mine=2, mini=2, gemi=4, gini=4}
```
_-----------------------------------------------------------------------------_

**Input** : 
```bash
gem
```
**Output** :
```bash
{mine=2, mini=2, gemi=4, gini=4}
```
_-----------------------------------------------------------------------------_
**Input** :
```bash
gemi
```
**Output** :
```bash
gemi:4
```
_-----------------------------------------------------------------------------_
**Input** :
```bash
gemini
```
**Output** :
```bash
gemini:0
```
## Run Locally

Clone the project

```bash
  git clone https://github.com/srashti-shukla/Assignment.git
```

Go to the project directory

```bash
  cd my-project
```

Install dependencies

```bash
  npm install
```

Start the server

```bash
  npm run start
```

## Tech Stack

**Platform :** JetBrains IDE Intellij 

**Language :** Java

**Packages used :** 
- import java.io.File;
- import java.io.FileReader;
- import java.io.IOException;
- import java.util.HashMap;
- import java.util.Properties;
- import java.util.Scanner;
- import java.util.logging.LogManager;
- import java.util.logging.FileHandler;
- import java.util.logging.Logger;
- import java.util.logging.SimpleFormatter

## Authors

- [@SrashtiShukla](https://github.com/srashti-shukla)

