.class public final synthetic Lk5/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li6/b;


# static fields
.field public static final synthetic a:Lk5/l;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lk5/l;

    invoke-direct {v0}, Lk5/l;-><init>()V

    sput-object v0, Lk5/l;->a:Lk5/l;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
