const execute = require('../utils');

test('simple if 1', async () => {
    let result = await execute("testIf1.wh", 0);
    expect(result[0]).toEqual(['a']);
});


test('simple if 2', async () => {
    let result = await execute("testIf1.wh", 32);
    expect(result[0]).toEqual(['b']);
});