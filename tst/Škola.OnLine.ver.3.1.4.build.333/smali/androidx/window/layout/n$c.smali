.class public final Landroidx/window/layout/n$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/window/layout/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:Landroid/app/Activity;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Landroidx/core/util/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/core/util/a<",
            "Landroidx/window/layout/v;",
            ">;"
        }
    .end annotation
.end field

.field private d:Landroidx/window/layout/v;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/concurrent/Executor;",
            "Landroidx/core/util/a<",
            "Landroidx/window/layout/v;",
            ">;)V"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "executor"

    invoke-static {p2, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/window/layout/n$c;->a:Landroid/app/Activity;

    iput-object p2, p0, Landroidx/window/layout/n$c;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Landroidx/window/layout/n$c;->c:Landroidx/core/util/a;

    return-void
.end method

.method public static synthetic a(Landroidx/window/layout/n$c;Landroidx/window/layout/v;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/window/layout/n$c;->c(Landroidx/window/layout/n$c;Landroidx/window/layout/v;)V

    return-void
.end method

.method private static final c(Landroidx/window/layout/n$c;Landroidx/window/layout/v;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$newLayoutInfo"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Landroidx/window/layout/n$c;->c:Landroidx/core/util/a;

    invoke-interface {p0, p1}, Landroidx/core/util/a;->accept(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b(Landroidx/window/layout/v;)V
    .locals 2

    const-string v0, "newLayoutInfo"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/window/layout/n$c;->d:Landroidx/window/layout/v;

    iget-object v0, p0, Landroidx/window/layout/n$c;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/window/layout/o;

    invoke-direct {v1, p0, p1}, Landroidx/window/layout/o;-><init>(Landroidx/window/layout/n$c;Landroidx/window/layout/v;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final d()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Landroidx/window/layout/n$c;->a:Landroid/app/Activity;

    return-object v0
.end method

.method public final e()Landroidx/core/util/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/core/util/a<",
            "Landroidx/window/layout/v;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/window/layout/n$c;->c:Landroidx/core/util/a;

    return-object v0
.end method

.method public final f()Landroidx/window/layout/v;
    .locals 1

    iget-object v0, p0, Landroidx/window/layout/n$c;->d:Landroidx/window/layout/v;

    return-object v0
.end method
