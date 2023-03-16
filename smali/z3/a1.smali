.class public final Lz3/a1;
.super Lz3/m0;
.source ""


# instance fields
.field final synthetic g:Lz3/c;


# direct methods
.method public constructor <init>(Lz3/c;ILandroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lz3/a1;->g:Lz3/c;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lz3/m0;-><init>(Lz3/c;ILandroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method protected final f(Lw3/b;)V
    .locals 1

    iget-object v0, p0, Lz3/a1;->g:Lz3/c;

    invoke-virtual {v0}, Lz3/c;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz3/a1;->g:Lz3/c;

    invoke-static {v0}, Lz3/c;->h0(Lz3/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lz3/a1;->g:Lz3/c;

    const/16 v0, 0x10

    invoke-static {p1, v0}, Lz3/c;->d0(Lz3/c;I)V

    return-void

    :cond_0
    iget-object v0, p0, Lz3/a1;->g:Lz3/c;

    iget-object v0, v0, Lz3/c;->C:Lz3/c$c;

    invoke-interface {v0, p1}, Lz3/c$c;->a(Lw3/b;)V

    iget-object v0, p0, Lz3/a1;->g:Lz3/c;

    invoke-virtual {v0, p1}, Lz3/c;->L(Lw3/b;)V

    return-void
.end method

.method protected final g()Z
    .locals 2

    iget-object v0, p0, Lz3/a1;->g:Lz3/c;

    iget-object v0, v0, Lz3/c;->C:Lz3/c$c;

    sget-object v1, Lw3/b;->r:Lw3/b;

    invoke-interface {v0, v1}, Lz3/c$c;->a(Lw3/b;)V

    const/4 v0, 0x1

    return v0
.end method
