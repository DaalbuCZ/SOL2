.class public final Lu4/o;
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

    iput-object p1, p0, Lu4/o;->a:Lv4/g;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu4/o;->a:Lv4/g;

    invoke-interface {v0}, Lv4/g;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu4/l;

    invoke-static {v0}, Lv4/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
