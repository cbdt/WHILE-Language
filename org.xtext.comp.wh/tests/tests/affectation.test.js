const execute = require('../utils');

test('swap 1 value', async () => {
    let result = await execute("testAffect1.wh", 1, 2);
    expect(result[0]).toEqual([2]);
});

test('invalid args (2 instead of 1)', async () => {
    let result = await execute("testAffect1.wh", 1);
    expect(result[0]).toBe("Le nombre d'argument n'est pas correct (1 au lieu de 2)");
});

test('swap 2 values', async () => {
    let result = await execute("testAffect2.wh", 1, 2);
    expect(result[0]).toEqual([2, 1]);
});

test('cons', async () => {
    let result = await execute("testAffect3.wh", 1);
    expect(result[0]).toEqual([3]);
});

test('hd cons', async () => {
    let result = await execute("testAffect4.wh", 78);
    expect(result[0]).toEqual([0]);
});

test('tl cons', async () => {
    let result = await execute("testAffect5.wh", 78);
    expect(result[0]).toEqual([2]);
});

test('list', async () => {
    let result = await execute("testAffect6.wh", 78);
    expect(result[0]).toEqual([4]);
});

test('tl tl cons', async () => {
    let result = await execute("testAffect7.wh", 78);
    expect(result[0]).toEqual([1]);
});

test('isA', async () => {
    let result = await execute("testIsA.wh", "(a)");
    expect(result[0]).toEqual([1]);
});