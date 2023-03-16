.class public final synthetic Lg6/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lg6/f;


# direct methods
.method public synthetic constructor <init>(Lg6/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/d;->a:Lg6/f;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lg6/d;->a:Lg6/f;

    invoke-static {v0}, Lg6/f;->d(Lg6/f;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
