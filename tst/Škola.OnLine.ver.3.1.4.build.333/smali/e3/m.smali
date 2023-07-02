.class public final synthetic Le3/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Le3/p$b;


# direct methods
.method public synthetic constructor <init>(Le3/p$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le3/m;->n:Le3/p$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Le3/m;->n:Le3/p$b;

    invoke-interface {v0}, Le3/p$b;->b()V

    return-void
.end method
