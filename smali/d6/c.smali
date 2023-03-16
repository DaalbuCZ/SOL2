.class public final synthetic Ld6/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb6/f;


# static fields
.field public static final synthetic a:Ld6/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ld6/c;

    invoke-direct {v0}, Ld6/c;-><init>()V

    sput-object v0, Ld6/c;->a:Ld6/c;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lb6/g;

    invoke-static {p1, p2}, Ld6/d;->c(Ljava/lang/String;Lb6/g;)V

    return-void
.end method
