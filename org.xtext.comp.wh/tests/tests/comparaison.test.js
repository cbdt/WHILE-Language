const execute = require('../utils');

test('isA', async () => {
    let result = await execute("testIsA.wh", "(a)");
    expect(result[0]).toEqual([1]);
});

/*
test('simple and', async () => {
    let result = await execute("testSimpleAnd.wh", "(a)");
    expect(result[0]).toEqual([1]);
});


test('simple or', async () => {
    let result = await execute("testSimpleOr.wh", "(a)");
    expect(result[0]).toEqual([1]);
});
*/