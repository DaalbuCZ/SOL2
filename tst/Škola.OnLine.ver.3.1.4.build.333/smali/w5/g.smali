.class public final synthetic Lw5/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lw5/i;


# direct methods
.method public synthetic constructor <init>(Lw5/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/g;->a:Lw5/i;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lw5/g;->a:Lw5/i;

    invoke-static {v0}, Lw5/i;->a(Lw5/i;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
