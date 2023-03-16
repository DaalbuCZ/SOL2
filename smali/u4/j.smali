.class public final Lu4/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lv4/g;


# instance fields
.field private final a:Lv4/g;


# direct methods
.method public constructor <init>(Lv4/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/j;->a:Lv4/g;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lu4/j;->a:Lv4/g;

    check-cast v0, Lu4/p;

    invoke-virtual {v0}, Lu4/p;->b()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lu4/i;

    invoke-direct {v1, v0}, Lu4/i;-><init>(Landroid/content/Context;)V

    return-object v1
.end method
