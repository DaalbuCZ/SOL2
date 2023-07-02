.class public final synthetic Lg8/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lg8/c$h;


# direct methods
.method public synthetic constructor <init>(Lg8/c$h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/e;->n:Lg8/c$h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lg8/e;->n:Lg8/c$h;

    invoke-static {v0}, Lg8/c$h;->c(Lg8/c$h;)V

    return-void
.end method
