.class public final synthetic Lq5/g0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt4/a;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq5/g0;->a:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final a(Lt4/i;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lq5/g0;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-static {v0, p1}, Lq5/j0;->c(Ljava/util/concurrent/CountDownLatch;Lt4/i;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
