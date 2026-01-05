# leetcode-daily-2026

A personal repository for solving LeetCode problems during 2026. Each solution is implemented in Java under the `src/` directory. The project is intentionally lightweight so solutions can be compiled and run with the JDK or opened in an IDE (IntelliJ IDEA / Eclipse).

## Repository structure

- `src/`
  - `Main.java` — small runner / entrypoint for testing solutions.
  - `leecode/` — Java classes for individual LeetCode problems (e.g. `LC_1411.java`, `LC_1975.java`, ...).

## Requirements

- Java JDK 25
- (Optional) An IDE such as IntelliJ IDEA for quick editing and running

## Build & run (PowerShell)

From the repository root (where this `README.md` lives) you can compile and run the project with the JDK installed.

Compile all sources into an `out` directory:

```powershell
javac -d out src\Main.java src\leecode\*.java
```

Run the main class:

```powershell
java -cp out Main
```

If you add new packages or nested directories, compile them together, for example:

```powershell
javac -d out (Get-ChildItem -Path src -Recurse -Filter "*.java" | ForEach-Object FullName) -Encoding utf8
```

(Or simply open the project in an IDE and run `Main`.)

## How solutions are organized

- Files named `LC_<problem-number>.java` contain the implementation for that LeetCode problem.
- Keep each solution self-contained and include a small test snippet or `main` method in `Main.java` that invokes and demonstrates the solution.

## Contributing / Adding new solutions

1. Create a new file under `src/leecode/` named `LC_<number>.java`.
2. Implement the solution using a public class and a clear method name.
3. Add or update `Main.java` to include a quick test runner for your new solution.
4. Verify compilation with the `javac` command above.

## Notes / Tips

- Prefer small, focused commits per problem.
- Include problem references (URL or short description) in the file header or comments.

## License & Contact

This repository contains personal practice solutions. Use freely for learning and reference. If you want to get in touch or suggest improvements, open an issue or send a message to the repository owner.

Happy coding in 2026!

