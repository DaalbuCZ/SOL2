.class public final synthetic Landroidx/lifecycle/c0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroidx/lifecycle/b0$b;->a:Landroidx/lifecycle/b0$b$a;

    return-void
.end method

.method public static a(Landroidx/lifecycle/b0$b;Ljava/lang/Class;)Landroidx/lifecycle/a0;
    .locals 0

    const-string p0, "modelClass"

    .line 1
    invoke-static {p1, p0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method."

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Landroidx/lifecycle/b0$b;Ljava/lang/Class;Ly/a;)Landroidx/lifecycle/a0;
    .locals 1

    const-string v0, "modelClass"

    .line 1
    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Landroidx/lifecycle/b0$b;->a(Ljava/lang/Class;)Landroidx/lifecycle/a0;

    move-result-object p0

    return-object p0
.end method
