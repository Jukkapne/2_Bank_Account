<h2>Bank Account Assignment</h2>

<p><strong>Objective:</strong> Implement a <code>BankAccount</code> class with specific methods that will be tested automatically.</p>

<h3>Instructions:</h3>
<ol>
    <li>
        <p><strong>Create the <code>BankAccount</code> Class:</strong></p>
        <ul>
            <li>The <code>BankAccount</code> class should be created in the <code>bankaccount</code> package.</li>
            <li>It should have the following private attributes:</li>
            <ul>
                <li><code>String accountNumber</code></li>
                <li><code>double balance</code></li>
            </ul>
            <li>Implement the following methods:</li>
            <ol>
                <li><strong>Constructor:</strong>
                    <ul>
                        <li><code>BankAccount(String accountNumber, double initialBalance)</code>: Initializes the <code>accountNumber</code> and <code>balance</code> attributes.</li>
                    </ul>
                </li>
                <li><strong>Methods:</strong>
                    <ul>
                        <li><code>void deposit(double amount)</code>: Adds the <code>amount</code> to <code>balance</code>.</li>
                        <li><code>boolean withdraw(double amount)</code>: Subtracts <code>amount</code> from <code>balance</code> if there are sufficient funds. Returns <code>true</code> if successful, otherwise returns <code>false</code>.</li>
                        <li><code>double getBalance()</code>: Returns the current balance.</li>
                        <li><code>String getAccountNumber()</code>: Returns the account number.</li>
                    </ul>
                </li>
                <li><strong>Additional Method:</strong>
                    <ul>
                        <li><code>void displayBalance()</code>: Prints the current balance (Note: This method won't be directly tested by automated tests, but it's good for manual checks).</li>
                    </ul>
                </li>
            </ol>
        </ul>
    </li>
    <li>
        <p><strong>Testing Requirements:</strong></p>
        <p><em>Note to Students:</em> Do not modify the method signatures provided. Your <code>BankAccount</code> class will be automatically tested, so the method names and signatures must match exactly.</p>
    </li>
    <li>
        <p><strong>Test Cases:</strong></p>
        <p>You do <strong>not</strong> need to write any test cases. They are provided and will be used to test your <code>BankAccount</code> implementation automatically.</p>
    </li>
</ol>

<h3>Key Points for the Student:</h3>
<ul>
    <li><strong>Focus on the <code>BankAccount</code> class:</strong> The assignment is structured so that all of your work revolves around implementing this one class with specific methods.</li>
    <li><strong>No Need for <code>main</code> Method:</strong> Since the testing is done through JUnit tests, there’s no need to write a <code>main</code> method or modify <code>App.java</code>. The tests simulate real-world use cases and verify the correctness of your implementation.</li>
    <li><strong>Automated Feedback:</strong> You will receive automated feedback as soon as you push your code. This will allow you to iteratively improve your implementation if necessary.</li>
</ul>

<p><strong>Important:</strong> Follow the instructions carefully to ensure your code passes the automated tests. Good luck!</p>
