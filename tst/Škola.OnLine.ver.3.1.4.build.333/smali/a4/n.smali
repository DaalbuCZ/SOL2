.class public final synthetic La4/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:La4/r;


# direct methods
.method public synthetic constructor <init>(La4/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4/n;->n:La4/r;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, La4/n;->n:La4/r;

    invoke-virtual {v0}, La4/r;->d()V

    return-void
.end method
