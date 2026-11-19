
export const processOrder = (order, { processPayment }) => {

    // Get the order amount
    const amount = order.amount;

    // Process payment using the injected function
    const paymentResult = processPayment(amount);

    // Return payment result
    return paymentResult;
};
