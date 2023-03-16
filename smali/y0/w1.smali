.class public Ly0/w1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# static fields
.field private static final c:Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field private final a:Ly0/p2;

.field private final b:Ljava/lang/Thread$UncaughtExceptionHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly0/w1$a;

    invoke-direct {v0}, Ly0/w1$a;-><init>()V

    sput-object v0, Ly0/w1;->c:Ljava/lang/Thread$UncaughtExceptionHandler;

    return-void
.end method

.method public constructor <init>(Ly0/p2;Ljava/lang/Thread$UncaughtExceptionHandler;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/w1;->a:Ly0/p2;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p2, Ly0/w1;->c:Ljava/lang/Thread$UncaughtExceptionHandler;

    :goto_0
    iput-object p2, p0, Ly0/w1;->b:Ljava/lang/Thread$UncaughtExceptionHandler;

    return-void
.end method


# virtual methods
.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 2

    invoke-static {p1, p2}, Ly0/q2;->a(Ljava/lang/Thread;Ljava/lang/Throwable;)Ly0/q2;

    move-result-object v0

    iget-object v1, p0, Ly0/w1;->a:Ly0/p2;

    invoke-virtual {v1, v0}, Ly0/p2;->d(Ly0/q2;)V

    iget-object v0, p0, Ly0/w1;->b:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method
