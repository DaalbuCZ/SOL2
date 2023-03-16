.class public final Landroidx/window/layout/q$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/window/layout/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Landroidx/window/layout/q$a;

.field private static final b:Z

.field private static final c:Ljava/lang/String;

.field private static d:Landroidx/window/layout/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/window/layout/q$a;

    invoke-direct {v0}, Landroidx/window/layout/q$a;-><init>()V

    sput-object v0, Landroidx/window/layout/q$a;->a:Landroidx/window/layout/q$a;

    const-class v0, Landroidx/window/layout/q;

    invoke-static {v0}, Lk9/s;->b(Ljava/lang/Class;)Lo9/b;

    move-result-object v0

    invoke-interface {v0}, Lo9/b;->a()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/window/layout/q$a;->c:Ljava/lang/String;

    sget-object v0, Landroidx/window/layout/f;->a:Landroidx/window/layout/f;

    sput-object v0, Landroidx/window/layout/q$a;->d:Landroidx/window/layout/r;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Landroidx/window/layout/q;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/window/layout/s;

    sget-object v1, Landroidx/window/layout/y;->a:Landroidx/window/layout/y;

    invoke-virtual {p0, p1}, Landroidx/window/layout/q$a;->b(Landroid/content/Context;)Landroidx/window/layout/p;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Landroidx/window/layout/s;-><init>(Landroidx/window/layout/x;Landroidx/window/layout/p;)V

    sget-object p1, Landroidx/window/layout/q$a;->d:Landroidx/window/layout/r;

    invoke-interface {p1, v0}, Landroidx/window/layout/r;->a(Landroidx/window/layout/q;)Landroidx/window/layout/q;

    move-result-object p1

    return-object p1
.end method

.method public final b(Landroid/content/Context;)Landroidx/window/layout/p;
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Landroidx/window/layout/l;->a:Landroidx/window/layout/l;

    invoke-virtual {v1}, Landroidx/window/layout/l;->m()Landroidx/window/extensions/layout/WindowLayoutComponent;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Landroidx/window/layout/h;

    invoke-direct {v2, v1}, Landroidx/window/layout/h;-><init>(Landroidx/window/extensions/layout/WindowLayoutComponent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v0, v2

    goto :goto_0

    :catchall_0
    sget-boolean v1, Landroidx/window/layout/q$a;->b:Z

    if-eqz v1, :cond_1

    sget-object v1, Landroidx/window/layout/q$a;->c:Ljava/lang/String;

    const-string v2, "Failed to load WindowExtensions"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    if-nez v0, :cond_2

    sget-object v0, Landroidx/window/layout/n;->c:Landroidx/window/layout/n$a;

    invoke-virtual {v0, p1}, Landroidx/window/layout/n$a;->a(Landroid/content/Context;)Landroidx/window/layout/n;

    move-result-object v0

    :cond_2
    return-object v0
.end method
