.class final Lb7/b;
.super Lb7/e;
.source ""


# instance fields
.field private final a:Lg7/g;


# direct methods
.method constructor <init>(Lg7/g;)V
    .locals 0

    invoke-direct {p0}, Lb7/e;-><init>()V

    iput-object p1, p0, Lb7/b;->a:Lg7/g;

    return-void
.end method


# virtual methods
.method public c()Z
    .locals 1

    iget-object v0, p0, Lb7/b;->a:Lg7/g;

    invoke-virtual {v0}, Lg7/g;->f0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb7/b;->a:Lg7/g;

    invoke-virtual {v0}, Lg7/g;->b0()I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lb7/b;->a:Lg7/g;

    invoke-virtual {v0}, Lg7/g;->a0()I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lb7/b;->a:Lg7/g;

    invoke-virtual {v0}, Lg7/g;->e0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb7/b;->a:Lg7/g;

    invoke-virtual {v0}, Lg7/g;->d0()Lg7/f;

    move-result-object v0

    invoke-virtual {v0}, Lg7/f;->W()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
