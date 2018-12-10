const execute = require('../utils');

test('swap 1 value', async () => {
    let result = await execute("testAffect1.wh", 1, 2);
    expect(result).toEqual([2]);
});

test('invalid args (2 instead of 1)', async () => {
    let result = await execute("testAffect1.wh", 1);
    expect(result).toBe("Le nombre d'argument n'est pas correct (1 au lieu de 2)");
});

test('swap 2 values', async () => {
    let result = await execute("testAffect2.wh", 1, 2);
    expect(result).toEqual([2, 1]);
});

test('cons', async () => {
    let result = await execute("testAffect3.wh", 1);
    expect(result).toEqual([3]);
});
