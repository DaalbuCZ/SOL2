.class public final synthetic Lr5/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lr5/i;


# direct methods
.method public synthetic constructor <init>(Lr5/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr5/g;->a:Lr5/i;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr5/g;->a:Lr5/i;

    invoke-static {v0}, Lr5/i;->a(Lr5/i;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
