.class Lg8/c$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg8/c$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# instance fields
.field a:Ljava/util/concurrent/ExecutorService;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lf8/a;->e()Lf8/a;

    move-result-object v0

    invoke-virtual {v0}, Lf8/a;->b()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lg8/c$e;->a:Ljava/util/concurrent/ExecutorService;

    return-void
.end method


# virtual methods
.method public a(Lt8/c$d;)Lg8/c$d;
    .locals 1

    invoke-virtual {p1}, Lt8/c$d;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lg8/c$h;

    iget-object v0, p0, Lg8/c$e;->a:Ljava/util/concurrent/ExecutorService;

    invoke-direct {p1, v0}, Lg8/c$h;-><init>(Ljava/util/concurrent/ExecutorService;)V

    return-object p1

    :cond_0
    new-instance p1, Lg8/c$c;

    iget-object v0, p0, Lg8/c$e;->a:Ljava/util/concurrent/ExecutorService;

    invoke-direct {p1, v0}, Lg8/c$c;-><init>(Ljava/util/concurrent/ExecutorService;)V

    return-object p1
.end method
