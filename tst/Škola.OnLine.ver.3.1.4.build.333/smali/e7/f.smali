.class public final synthetic Le7/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Le7/k;


# direct methods
.method public synthetic constructor <init>(Le7/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/f;->n:Le7/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Le7/f;->n:Le7/k;

    invoke-static {v0}, Le7/k;->d(Le7/k;)V

    return-void
.end method
