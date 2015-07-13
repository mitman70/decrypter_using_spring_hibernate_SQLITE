Introduction
A company has decided to branch out from making highly secure e-books and move into the world of Accountancy, using their sophisticated book protection technology.
We need to open up one of their "books" so that we're prepared for their accountancy application. Fortunately a bunch of talented hackers have documented how the format works:-
Each book is stored using a system called "SQLite". Internally they store everything within two tables.
One table contains individual fragments of the book, however, these are encrypted using a proprietary scheme, covered in the second table.


Fortunately the hackers managed to figure out the encryption scheme. Each character is rotated by a certain amount, which is stored within this second table. Each block of fragments is rotated by what could be a different amount.
Character rotation is generally popularised by the comparatively well known "rot13" - it simply means to replace each character by the one following it - wrapping around if necessary.


For example, if we rotated by 2 characters, A would become C , X would become Z and Y would become A .


Problem
You should have received a file alongside this document that contains sample data for you to decode. Your mission is to write a 'decrypter' for these books, and, for bonus points, identify the book itself.
Submission
Please complete the problem using the language of your choice, then compress and return your solution via email.
If you managed to identify the book please remember to include the book title in your covering email.