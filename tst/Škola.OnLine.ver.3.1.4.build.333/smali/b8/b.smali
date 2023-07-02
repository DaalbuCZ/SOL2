.class public final synthetic Lb8/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lb8/d;


# direct methods
.method public synthetic constructor <init>(Lb8/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb8/b;->n:Lb8/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lb8/b;->n:Lb8/d;

    invoke-static {v0}, Lb8/d;->c(Lb8/d;)V

    return-void
.end method
