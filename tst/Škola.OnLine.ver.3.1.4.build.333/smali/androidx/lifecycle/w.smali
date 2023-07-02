.class public final Landroidx/lifecycle/w;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ly/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly/a$b<",
            "Lf0/e;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Ly/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly/a$b<",
            "Landroidx/lifecycle/f0;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Ly/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly/a$b<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/w$b;

    invoke-direct {v0}, Landroidx/lifecycle/w$b;-><init>()V

    sput-object v0, Landroidx/lifecycle/w;->a:Ly/a$b;

    new-instance v0, Landroidx/lifecycle/w$c;

    invoke-direct {v0}, Landroidx/lifecycle/w$c;-><init>()V

    sput-object v0, Landroidx/lifecycle/w;->b:Ly/a$b;

    new-instance v0, Landroidx/lifecycle/w$a;

    invoke-direct {v0}, Landroidx/lifecycle/w$a;-><init>()V

    sput-object v0, Landroidx/lifecycle/w;->c:Ly/a$b;

    return-void
.end method

.method public static final a(Lf0/e;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lf0/e;",
            ":",
            "Landroidx/lifecycle/f0;",
            ">(TT;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Landroidx/lifecycle/j;->a()Landroidx/lifecycle/f;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/f;->b()Landroidx/lifecycle/f$c;

    move-result-object v0

    const-string v1, "lifecycle.currentState"

    invoke-static {v0, v1}, Ls9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Landroidx/lifecycle/f$c;->o:Landroidx/lifecycle/f$c;

    if-eq v0, v1, :cond_1

    sget-object v1, Landroidx/lifecycle/f$c;->p:Landroidx/lifecycle/f$c;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_3

    invoke-interface {p0}, Lf0/e;->j()Lf0/c;

    move-result-object v0

    const-string v1, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    invoke-virtual {v0, v1}, Lf0/c;->c(Ljava/lang/String;)Lf0/c$c;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Landroidx/lifecycle/x;

    invoke-interface {p0}, Lf0/e;->j()Lf0/c;

    move-result-object v2

    move-object v3, p0

    check-cast v3, Landroidx/lifecycle/f0;

    invoke-direct {v0, v2, v3}, Landroidx/lifecycle/x;-><init>(Lf0/c;Landroidx/lifecycle/f0;)V

    invoke-interface {p0}, Lf0/e;->j()Lf0/c;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Lf0/c;->h(Ljava/lang/String;Lf0/c$c;)V

    invoke-interface {p0}, Landroidx/lifecycle/j;->a()Landroidx/lifecycle/f;

    move-result-object p0

    new-instance v1, Landroidx/lifecycle/SavedStateHandleAttacher;

    invoke-direct {v1, v0}, Landroidx/lifecycle/SavedStateHandleAttacher;-><init>(Landroidx/lifecycle/x;)V

    invoke-virtual {p0, v1}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/i;)V

    :cond_2
    return-void

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(Landroidx/lifecycle/f0;)Landroidx/lifecycle/y;
    .locals 4

    const-class v0, Landroidx/lifecycle/y;

    const-string v1, "<this>"

    invoke-static {p0, v1}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ly/c;

    invoke-direct {v1}, Ly/c;-><init>()V

    sget-object v2, Landroidx/lifecycle/w$d;->o:Landroidx/lifecycle/w$d;

    invoke-static {v0}, Ls9/s;->b(Ljava/lang/Class;)Lw9/b;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Ly/c;->a(Lw9/b;Lr9/l;)V

    invoke-virtual {v1}, Ly/c;->b()Landroidx/lifecycle/b0$b;

    move-result-object v1

    new-instance v2, Landroidx/lifecycle/b0;

    invoke-direct {v2, p0, v1}, Landroidx/lifecycle/b0;-><init>(Landroidx/lifecycle/f0;Landroidx/lifecycle/b0$b;)V

    const-string p0, "androidx.lifecycle.internal.SavedStateHandlesVM"

    invoke-virtual {v2, p0, v0}, Landroidx/lifecycle/b0;->b(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/a0;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/y;

    return-object p0
.end method
