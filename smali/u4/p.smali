.class public final Lu4/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lv4/g;


# instance fields
.field private final a:Lu4/n;


# direct methods
.method public constructor <init>(Lu4/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/p;->a:Lu4/n;

    return-void
.end method


# virtual methods
.method public final synthetic a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu4/p;->a:Lu4/n;

    invoke-virtual {v0}, Lu4/n;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lv4/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final b()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lu4/p;->a:Lu4/n;

    invoke-virtual {v0}, Lu4/n;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lv4/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
