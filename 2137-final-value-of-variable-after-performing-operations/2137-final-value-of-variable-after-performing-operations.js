/**
 * @param {string[]} operations
 * @return {number}
 */
var finalValueAfterOperations = function(operations) {
    return operations.reduce((acc, curr) => curr === "--X" || curr === "X--" ? acc-1 : acc+1, 0);
};