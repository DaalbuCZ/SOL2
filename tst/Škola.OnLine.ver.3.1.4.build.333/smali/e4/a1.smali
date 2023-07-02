.class public final Le4/a1;
.super Le4/m0;
.source ""


# instance fields
.field final synthetic g:Le4/c;


# direct methods
.method public constructor <init>(Le4/c;ILandroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Le4/a1;->g:Le4/c;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Le4/m0;-><init>(Le4/c;ILandroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method protected final f(Lb4/b;)V
    .locals 1

    iget-object v0, p0, Le4/a1;->g:Le4/c;

    invoke-virtual {v0}, Le4/c;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le4/a1;->g:Le4/c;

    invoke-static {v0}, Le4/c;->h0(Le4/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Le4/a1;->g:Le4/c;

    const/16 v0, 0x10

    invoke-static {p1, v0}, Le4/c;->d0(Le4/c;I)V

    return-void

    :cond_0
    iget-object v0, p0, Le4/a1;->g:Le4/c;

    iget-object v0, v0, Le4/c;->C:Le4/c$c;

    invoke-interface {v0, p1}, Le4/c$c;->a(Lb4/b;)V

    iget-object v0, p0, Le4/a1;->g:Le4/c;

    invoke-virtual {v0, p1}, Le4/c;->L(Lb4/b;)V

    return-void
.end method

.method protected final g()Z
    .locals 2

    iget-object v0, p0, Le4/a1;->g:Le4/c;

    iget-object v0, v0, Le4/c;->C:Le4/c$c;

    sget-object v1, Lb4/b;->r:Lb4/b;

    invoke-interface {v0, v1}, Le4/c$c;->a(Lb4/b;)V

    const/4 v0, 0x1

    return v0
.end method
