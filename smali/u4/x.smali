.class public final Lu4/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lv4/g;


# instance fields
.field private final a:Lv4/g;

.field private final b:Lv4/g;


# direct methods
.method public constructor <init>(Lv4/g;Lv4/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/x;->a:Lv4/g;

    iput-object p2, p0, Lu4/x;->b:Lv4/g;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lu4/x;->a:Lv4/g;

    check-cast v0, Lu4/p;

    invoke-virtual {v0}, Lu4/p;->b()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lu4/x;->b:Lv4/g;

    invoke-interface {v1}, Lv4/g;->a()Ljava/lang/Object;

    move-result-object v1

    new-instance v2, Lu4/w;

    check-cast v1, Lu4/y;

    invoke-direct {v2, v0, v1}, Lu4/w;-><init>(Landroid/content/Context;Lu4/y;)V

    return-object v2
.end method
