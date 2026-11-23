
import { jest } from '@jest/globals';
test('mock implementation example', () => {

    const add = jest.fn();

    add.mockImplementation((a, b) => {
        return a + b;
    });

    const result = add(20, 30);

    expect(result).toBe(50);

    expect(add).toHaveBeenCalledTimes(1);

});