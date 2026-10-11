# MC-311974-Fix
mod that fixes players moving choppy on 26.3, good for pvp

# How does this work?
`(information from https://bugs.mojang.com/browse/MC/issues/MC-311974)`

Minecraft before the 26.3 update made entity movement smooth over 3 game ticks

But on the 26.3 update, they made a new smoothing method and that new method could finish before the next position update happens, making it look really choppy.

<img width="699" height="631" alt="image" src="https://github.com/user-attachments/assets/dca588a0-cc55-4bf6-8d3e-01e0c2450a86" />



# Why did i make this?
I was playing on pvphq when I got smoked by a lt5,
and i realised something was wrong

So I switched back to 26.1.2 and later that same day I found the bug report from 1 month ago, still unresolved
Then I made the mod to fix pvp for 26.3 players.
