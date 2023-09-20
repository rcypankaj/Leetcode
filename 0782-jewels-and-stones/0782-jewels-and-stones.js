/**
 * @param {string} jewels
 * @param {string} stones
 * @return {number}
 */
var numJewelsInStones = function(jewels, stones) {
    return stones.split("").reduce((acc, curr) => jewels.includes(curr) ? acc+1 : acc, 0);
};