const execute = require('../utils');

/*test('simple for', async () => {
    const x = 54;
    const y = 43;
    let result = await execute("testSimpleFor.wh", x, y);
    expect(result[0]).toEqual([x+y]);
});*/

/*
test('simple foreach', async () => {
    let result = await execute("testSimpleForeach.wh", "54");
    expect(result[0]).toEqual([0]);
});*/

test('inverse list foreach', async () => {
    let result = await execute("testSimpleForeach.wh", "(cons a (cons b (cons c (cons d nil))))");
    expect(result[0]).toEqual(["(cons d (cons c (cons b (cons a nil))))"]);
});

/*
test('simple while', async () => {
    let result = await execute("testSimpleWhile.wh", "(a)");
    expect(result[0]).toEqual([1]);
});
*/