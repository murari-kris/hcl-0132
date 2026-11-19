import { greet, greetInHindi } from './app.js';
import test, { describe, mock } from 'node:test';
import assert from 'node:assert';
import { processOrder } from './order.js';
describe('order feature', () => {

    test('it should process the order correctly', () => {

        const mockedProcessPayment = mock.fn((amount) => {
            console.log('I am mocked process payment function');

            return { id: '123', amount };
        });

        const expected = { id: '123', amount: 500 };

        const actual = processOrder(
            { amount: 500 },
            { processPayment: mockedProcessPayment }
        );

        assert.deepStrictEqual(actual, expected);

        assert.strictEqual(mockedProcessPayment.mock.calls.length, 1);
    });
});

test('greet function should return a greeting message', () => {
    const expected = 'Hello, World!';
    const actual = greet('World');

    assert.strictEqual(actual, expected);
});

test('greet should return a Hindi greeting', () => {
    const expected = 'Namaste Duniya';
    const actual = greetInHindi('Duniya');

    assert.strictEqual(actual, expected);
});