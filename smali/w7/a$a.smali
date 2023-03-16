.class Lw7/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ll8/k$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw7/a;->onAttachedToEngine(Lc8/a$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lw7/a;


# direct methods
.method constructor <init>(Lw7/a;)V
    .locals 0

    iput-object p1, p0, Lw7/a$a;->n:Lw7/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMethodCall(Ll8/j;Ll8/k$d;)V
    .locals 1

    const/4 p1, 0x0

    :try_start_0
    const-string v0, "sqlcipher"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    invoke-interface {p2, p1}, Ll8/k$d;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0, p1, p1}, Ll8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
