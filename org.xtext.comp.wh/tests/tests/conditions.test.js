const execute = require('../utils');

test('simple if 1', async () => {
    let result = await execute("testIf1.wh", 0);
    expect(result[0]).toEqual(['b']);
});


test('simple if 2', async () => {
    let result = await execute("testIf1.wh", 32);
    expect(result[0]).toEqual(['a']);
});

test('cond 1', async () => {
    let result = await execute("testCond1.wh", 1, 1);
    expect(result[0]).toEqual([0]);
});

test('cond 2', async () => {
    let result = await execute("testCond2.wh", 1, 2);
    expect(result[0]).toEqual([2]);
});