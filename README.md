# ⛏️ Mine Escape – The Last Shift

> **Escape the mine. Solve the puzzles. Survive the shift.**

## 📌 Project Overview

**Mine Escape – The Last Shift** is an interactive Java console-based survival game.

The player takes the role of a miner who becomes trapped underground after a sudden rockfall blocks the main exit. To escape, the player must explore the mine, discover different tunnels, collect useful items, solve puzzles, avoid dangerous situations, and manage limited resources.

The objective is simple:

**Explore → Survive → Solve → Find the Exit → Escape**

---

## 🎯 Objective

The main objective of the game is to **successfully escape the underground mine while keeping the player's health and resources under control**.

During the journey, the player needs to:

- Explore different areas of the mine
- Find useful items
- Solve puzzles
- Handle unexpected hazards
- Choose between different routes
- Manage health, battery, and water
- Find the Mine Key
- Discover the emergency exit
- Achieve the highest possible survival score

---

## 🎮 How to Play

When the game starts, enter your player name.

You will then see your initial status:

```text
========================================
          ⛏️ MINE ESCAPE
          THE LAST SHIFT
========================================

Player  : Shiva
Health  : 100
Battery : 80
Water   : 3
```

You will be presented with a menu of actions.

```text
1. Explore Mine
2. Check Map
3. Check Inventory
4. View Status
5. Use Item
6. Exit Game
```

Select an option by entering its corresponding number.

---

## 🗺️ Explore the Mine

The mine contains multiple connected areas.

```text
       [A] ─── [B] ─── [C]
        │       │
       [D] ─── [E] ─── [F]
                │
               [G] ─── [H]
                         │
                       [EXIT]
```

Each area can contain:

- Different routes
- Items
- Puzzles
- Hazards
- Important discoveries

The player must decide which route to take.

---

## 🎒 Collect and Use Items

During exploration, you can discover useful items.

### 🔨 Pickaxe
Used to clear certain rock blockages.

### 🔦 Torch
Helps you navigate dark areas.

### 💧 Water Bottle
Helps maintain your survival resources.

### 🩹 First Aid Kit
Restores some health.

### 🔑 Mine Key
Required to unlock the final emergency exit.

### 🪢 Rope
Can be useful in specific situations.

Your collected items can be viewed through the **Inventory** option.

---

## 🧩 Solve Puzzles

Certain areas contain puzzles that must be solved to progress.

Example:

```text
================================
         MINING PUZZLE
================================

A security door is locked.

Solve:

5 + 7 × 2 = ?

Enter answer:
```

A correct answer may:

- Unlock a door
- Reveal a route
- Give you an item
- Increase your score

An incorrect answer may result in a penalty.

---

## ⚠️ Mine Hazards

The mine is not safe.

While exploring, you may encounter:

- 🪨 Rockfalls
- ☠️ Gas leaks
- 🔦 Dark tunnels
- ⚠️ Broken floors
- 💧 Dehydration
- 🚧 Blocked passages

Different hazards can affect your health or resources.

Example:

```text
⚠️ WARNING!

Toxic gas detected!

Health -20
Battery -5
```

Your decisions determine whether you survive.

---

## ❤️ Resource Management

You begin the game with limited resources.

| Resource | Starting Value |
|---|---:|
| ❤️ Health | 100 |
| 🔦 Battery | 80 |
| 💧 Water | 3 |

Exploring and encountering hazards can consume resources.

Therefore, you should **think before choosing a route** rather than simply exploring randomly.

---

# 🏆 Survival Score

Your final score depends on how successfully you complete the mission.

You can earn points by:

- Exploring new areas
- Solving puzzles
- Finding items
- Making safe decisions
- Discovering secret routes
- Successfully escaping

At the end, a survival report is displayed.

```text
====================================
        SURVIVAL REPORT
====================================

Rooms Explored : 6
Puzzles Solved : 3
Items Found    : 4
Health Left    : 65
Battery Left   : 30

Final Score    : 850
====================================
```

---

# 🚪 Multiple Endings

The game can end in different ways depending on your decisions.

### 🟢 Successful Escape

You find the Mine Key, reach the emergency exit, and escape the mine.

```text
🎉 YOU ESCAPED!

You survived the mine
and reached the surface safely.
```

### 🔴 Survival Failure

Your health reaches zero.

```text
💀 GAME OVER

You could not survive the mine.
```

### 🟠 Resource Failure

Important resources become exhausted before you can escape.

```text
⚠️ MISSION FAILED

You no longer have enough resources
to continue.
```

### 🟣 Secret Escape

A hidden route can be discovered through exploration and specific actions.

```text
🔓 SECRET EXIT DISCOVERED!

You found an abandoned emergency tunnel.

🏆 SECRET ESCAPE!
```

---

# 🔄 Game Workflow

```text
             ┌─────────────┐
             │    START    │
             └──────┬──────┘
                    ↓
          ┌──────────────────┐
          │ Enter Player Name│
          └────────┬─────────┘
                   ↓
          ┌──────────────────┐
          │ Initialize Game  │
          └────────┬─────────┘
                   ↓
             ┌───────────┐
             │ Main Menu │
             └─────┬─────┘
                   ↓
       ┌───────────┼───────────┐
       ↓           ↓           ↓
    Explore      Map       Inventory
       ↓           ↓           ↓
   Discover    Navigate    Use Items
   Hazards
   Items
   Puzzles
       │
       ↓
  Make Decisions
       │
       ↓
  Manage Resources
       │
       ↓
 ┌─────┴───────────────┐
 ↓                     ↓
Escape               Resources/
Successfully         Health Lost
 ↓                     ↓
🏆 WIN              💀 GAME OVER
```

---

# 🎯 Game Strategy

To successfully escape:

1. **Explore carefully** rather than randomly choosing paths.
2. **Collect useful items** whenever possible.
3. **Keep track of your health and battery.**
4. **Solve puzzles carefully.**
5. **Remember the rooms you have already explored.**
6. **Choose safer routes when possible.**
7. **Find the Mine Key.**
8. **Search for the emergency exit.**
9. **Try to preserve enough resources to reach the end.**

---

# ✨ Key Features

- ⛏️ Interactive mine exploration
- 🗺️ Underground mine map
- 🎒 Item collection and inventory
- 🧩 Puzzle-solving challenges
- ⚠️ Interactive hazards
- ❤️ Health management
- 🔦 Battery management
- 💧 Water management
- 🔀 Route-based decision making
- 🏆 Survival scoring
- 🚪 Multiple endings
- 🔓 Secret escape route
- 💻 Simple console-based gameplay

---

# 🚀 Future Improvements

The project can be expanded in the future with:

- Graphical user interface
- Sound effects and background music
- More mine levels
- More puzzles
- Multiplayer mode
- Difficulty levels
- Leaderboards
- Randomly generated mine layouts
- Save and resume functionality
- More realistic mining scenarios

---

## 🛠️ Technology

**Language:** Java  
**Application Type:** Console Application  
**Platform:** Any system with a Java runtime

---

## 👨‍💻 Project Purpose

This project was created as an **interactive Java academic project** that combines programming concepts with an engaging survival-game experience.

Rather than being a traditional data-entry application, **Mine Escape – The Last Shift** focuses on exploration, decision-making, problem-solving, and resource management.

---

## 🎮 Final Mission

> **The mine has collapsed. The exit is blocked. Your resources are limited.**
>
> **Can you find your way out before it's too late?** ⛏️🚨
