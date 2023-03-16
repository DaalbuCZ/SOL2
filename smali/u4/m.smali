.class public final Lu4/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lv4/g;


# instance fields
.field private final a:Lv4/g;

.field private final b:Lv4/g;

.field private final c:Lv4/g;


# direct methods
.method public constructor <init>(Lv4/g;Lv4/g;Lv4/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/m;->a:Lv4/g;

    iput-object p2, p0, Lu4/m;->b:Lv4/g;

    iput-object p3, p0, Lu4/m;->c:Lv4/g;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lu4/m;->a:Lv4/g;

    invoke-interface {v0}, Lv4/g;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lu4/m;->b:Lv4/g;

    invoke-interface {v1}, Lv4/g;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu4/i;

    iget-object v2, p0, Lu4/m;->c:Lv4/g;

    check-cast v2, Lu4/p;

    invoke-virtual {v2}, Lu4/p;->b()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Lu4/l;

    check-cast v0, Lu4/w;

    invoke-direct {v3, v0, v1, v2}, Lu4/l;-><init>(Lu4/w;Lu4/i;Landroid/content/Context;)V

    return-object v3
.end method
