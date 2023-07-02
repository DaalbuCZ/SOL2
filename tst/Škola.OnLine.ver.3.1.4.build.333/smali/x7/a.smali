.class public abstract Lx7/a;
.super Lx7/b;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx7/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Lx7/a;->o()Lx7/f;

    move-result-object v0

    invoke-interface {v0, p1}, Lx7/f;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Lx7/a;->o()Lx7/f;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lx7/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method protected abstract o()Lx7/f;
.end method
